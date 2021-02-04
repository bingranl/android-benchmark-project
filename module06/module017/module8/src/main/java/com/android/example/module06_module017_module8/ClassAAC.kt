package com.android.example.module06_module017_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.internal.schedulers.SingleScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..3) {
			for (iAc in 0..0) {
				for (iAd in 0..0) {
					param0.start()

					val local_var_5_0: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
					local_var_5_0.onWorkflowStopped(8440733346162237643)

					val local_var_5_1: com.squareup.workflow.ui.Named<kotlin.Any> = com.squareup.workflow.ui.Named(kotlin.Any(), "SomeString")
					local_var_5_1.component1()

				}
				val local_var_4_0: okio.AsyncTimeout = okio.AsyncTimeout()
				local_var_4_0.enter()

			}
		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.exit()

		val local_var_2_5: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_5.onWorkerOutput(7275831983437588933, 6210548688086805037, kotlin.Any())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.cancel()

		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.throwIfCanceled()

		val local_var_2_4: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
		local_var_2_4.clear()

		val local_var_2_5: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_5.postValue(kotlin.Any())

	}
}

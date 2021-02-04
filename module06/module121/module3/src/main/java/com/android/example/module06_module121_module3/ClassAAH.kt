package com.android.example.module06_module121_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.disposables.SerialDisposable
	) {
		param0.assertNotSubscribed()

		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
				local_var_4_0.throwIfCanceled()

			}
		}
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.getCancellationSignalObject()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.schedulers.TestScheduler,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_2.setValue(kotlin.Any())

		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 39)

	}

	fun method3(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method4(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_2.setValue(kotlin.Any())

		val local_var_2_3: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_3.postValue(kotlin.Any())

		val local_var_2_4: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_4.hasEnabledCallbacks()

	}
}

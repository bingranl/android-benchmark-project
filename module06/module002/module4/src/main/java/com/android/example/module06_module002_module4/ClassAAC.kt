package com.android.example.module06_module002_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module002_module1.ClassAAA = com.android.example.module06_module002_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module002_module1.ClassAAG = com.android.example.module06_module002_module1.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAB = com.android.example.module06_module002_module5.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module002_module5.ClassAAH = com.android.example.module06_module002_module5.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module002_module5.ClassAAD,
		param1: com.android.example.module06_module002_module1.ClassAAC,
		param2: com.android.example.module06_module002_module5.ClassAAE
	) {
		for (iAb in 0..3) {
			for (iAc in 0..2) {
				val local_var_4_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
				local_var_4_0.approveCall("SomeString", 62)

				val local_var_4_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
				local_var_4_1.approveCall("SomeString", 73)

				val local_var_4_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_2.clear()

				local_var_4_0.approveCall("SomeString", 99)

			}
			val local_var_3_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_0.cancel()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAI,
		param1: com.android.example.module06_module002_module1.ClassAAE,
		param2: com.android.example.module06_module002_module1.ClassAAJ,
		param3: com.android.example.module06_module002_module5.ClassAAI
	) {
		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 1)

		param0.method1(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

	}

	fun method2(
		param0: com.android.example.module06_module002_module5.ClassAAB,
		param1: com.android.example.module06_module002_module1.ClassAAF,
		param2: com.android.example.module06_module002_module5.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

	}
}

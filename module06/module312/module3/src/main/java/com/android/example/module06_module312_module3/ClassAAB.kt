package com.android.example.module06_module312_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module246.ClassAAG = com.android.example.module06_module246.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module246.ClassAAA = com.android.example.module06_module246.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module246.ClassAAJ,
		param1: com.android.example.module06_module246.ClassAAE,
		param2: com.android.example.module06_module246.ClassAAF,
		param3: com.android.example.module06_module246.ClassAAC
	) {
		val local_var_2_4: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_4.onNext(kotlin.Any())

		val local_var_2_5: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_5.dispose()

		for (iAb in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

			val local_var_3_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_1.get()

			val local_var_3_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_2.get()

		}
	}

	fun method1(
		param0: com.android.example.module06_module246.ClassAAB,
		param1: com.android.example.module06_module246.ClassAAF,
		param2: com.android.example.module06_module246.ClassAAB,
		param3: com.android.example.module06_module246.ClassAAC
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.cancel()

	}
}
